package phonebook.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import phonebook.restservice.entity.User;
import phonebook.restservice.repository.UserRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(nickname -> {
            User user = userRepository.findOne(nickname);
            if (user != null) {
                return new org.springframework.security.core.userdetails.User(user.getNickname(), user.getPassword(),
                        true, true, true, true, AuthorityUtils.createAuthorityList("USER"));
            } else {
                throw new UsernameNotFoundException("Could not find the user '" + nickname + "'");
            }
        });
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic().and().csrf().disable();
    }

}
