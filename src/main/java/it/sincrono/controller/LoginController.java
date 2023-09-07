package it.sincrono.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.sincrono.beans.Esito;
import it.sincrono.requests.EmailRequest;
import it.sincrono.requests.LoginRequest;
import it.sincrono.requests.RegisterRequest;
import it.sincrono.responses.GenericResponse;
import it.sincrono.responses.LoginResponse;
import it.sincrono.services.LoginService;
import it.sincrono.services.exceptions.ServiceException;
import it.sincrono.services.utils.RestClient;

@RestController
@RequestMapping("/login-service")
@CrossOrigin()
public class LoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private RestClient restClient;

	@PostMapping("/login")
	public HttpEntity<LoginResponse> login(@RequestBody LoginRequest request) {

		HttpEntity<LoginResponse> httpEntity = null;

		LoginResponse authenticationResponse = new LoginResponse();

		try {

			System.out.println("Start invocation of method authenticate of Authentication Service");

			authenticationResponse.setToken(loginService.login(request).getToken());

			System.out.println("End invocation of method authenticate of Authentication Service");

			httpEntity = new HttpEntity<LoginResponse>(authenticationResponse);

		} catch (ServiceException e) {
			authenticationResponse.setEsito(new Esito(e.getCode(), e.getMessage(), null));
			httpEntity = new HttpEntity<LoginResponse>(authenticationResponse);
		}
		return httpEntity;

	}

	@PostMapping("/recupero-password")
	public HttpEntity<GenericResponse> recuperoPassword(@RequestBody RegisterRequest request) {

		HttpEntity<GenericResponse> httpEntity = null;

		GenericResponse genericResponse = new GenericResponse();
		EmailRequest emailRequest = new EmailRequest(null, null, null, null, null);
		try {

			System.out.println("Start invocation of method authenticate of Authentication Service");

			String jwtToken = loginService.recuperoPassword(request.getUsername());

			System.out.println("End invocation of method authenticate of Authentication Service");

			httpEntity = new HttpEntity<GenericResponse>(genericResponse);

			emailRequest.setTo(request.getUsername());
			emailRequest.setSubject("Link per il recupero password");
			emailRequest.setBody("http://localhost:4200/form-recupero-password/" + jwtToken
					+ " Se non sei stato te a richiedere il reset della password," + " per favore ignora questa email");

			System.out.println(emailRequest);
			restClient.sendRequest("http://localhost:8085/mail/send", "POST", emailRequest.toString());

		} catch (ServiceException e) {
			genericResponse.setEsito(new Esito(e.getCode(), e.getMessage(), null));
			httpEntity = new HttpEntity<GenericResponse>(genericResponse);
		} catch (Exception e) {
			genericResponse.setEsito(new Esito(500, e.getMessage(), null));
			httpEntity = new HttpEntity<GenericResponse>(genericResponse);
		}
		return httpEntity;
	}

}