package om.jp;

import de.codecentric.boot.admin.server.config.AdminServerProperties;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@SpringBootApplication
@EnableAdminServer
public class SpringAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAdminServerApplication.class, args);
	}

//	@Profile("secure")
//	// tag::configuration-spring-security[]
//	@Configuration
//	public static class SecuritySecureConfig extends WebSecurityConfigurerAdapter {
//		private final String adminContextPath;
//
//		public SecuritySecureConfig(AdminServerProperties adminServerProperties) {
//			this.adminContextPath = adminServerProperties.getContextPath();
//		}
//
//		@Override
//		protected void configure(HttpSecurity http) throws Exception {
//			// @formatter:off
//			SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
//			successHandler.setTargetUrlParameter("redirectTo");
//			successHandler.setDefaultTargetUrl(adminContextPath + "/");
//
//			http.authorizeRequests()
//					.antMatchers(adminContextPath + "/assets/**").permitAll() // <1>
//					.antMatchers(adminContextPath + "/login").permitAll()
//					.anyRequest().authenticated() // <2>
//					.and()
//					.formLogin().loginPage(adminContextPath + "/login").successHandler(successHandler).and() // <3>
//					.logout().logoutUrl(adminContextPath + "/logout").and()
//					.httpBasic().and() // <4>
//					.csrf()
//					.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())  // <5>
//					.ignoringAntMatchers(
//							adminContextPath + "/instances",   // <6>
//							adminContextPath + "/actuator/**"  // <7>
//					);
//			// @formatter:on
//		}
//	}
}
