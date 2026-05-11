package security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SicurityConfig {
//
//
//
//        @Bean
//        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//            http
//                    .authorizeHttpRequests(auth -> auth
//                            .requestMatchers(
//                                    "/swagger-ui/**",
//                                    "/v3/api-docs/**",
//                                    "/swagger-resources/**",
//                                    "/webjars/**"
//                            ).permitAll() //
//                            .anyRequest().authenticated()
//                    )
//                    .csrf(csrf -> csrf.disable()); // ⚠️ Nécessaire pour tester POST/PUT via Swagger
//            return http.build();
//        }
//    }
//
