# Spring Security Workshop

A simple authentication and authorization using **Spring Security**, **JWT** and **PostgreSQL**.

**Spring Security** is a powerful and highly customizable authentication and access-control framework. It is the de-facto standard for securing Spring-based applications.

Spring Security is a framework that focuses on providing both authentication and authorization to Java applications. Like all Spring projects, the real power of Spring Security is found in how easily it can be extended to meet custom requirements

**Spring Security Architecture**

<img src="https://www.javainuse.com/static/series-2-2-min.jpg" alt="Spring Security Architecture" title="Optional title">

**What are *Filters* in Spring Security ?**

In Spring Security, filters play a crucial role in handling various aspects of security within a Spring-based application. Filters are components that process requests and responses at different stages of the request processing lifecycle. They are responsible for performing tasks such as authentication, authorization, session management, and other security-related operations.

Spring Security uses a chain of filters to process incoming requests and apply security measures. The order of these filters in the chain is important, as it determines the sequence in which they are applied. The filters work together to enforce security policies and handle tasks such as user authentication, access control, and protection against common security threats.

**What is *AuthenticationManager* in Spring Security ?**

In Spring Security, the AuthenticationManager interface is a key component responsible for performing authentication. Authentication is the process of verifying the identity of a user, typically by validating their credentials, such as a username and password. The AuthenticationManager is used to authenticate a user by delegating the authentication request to one or more configured AuthenticationProvider instances.

**What is *AuthenticationProvider* in Spring Security ?**

In Spring Security, an AuthenticationProvider is an interface that defines the contract for components responsible for authenticating users based on their credentials. It is a crucial part of the authentication process and plays a key role in determining whether a user is who they claim to be.

**Examples of Authentication Providers:**

**1-DaoAuthenticationProvider.** <br />
**2-LdapAuthenticationProvider.** <br />
**3-JwtAuthenticationProvider.** <br />
**4-And More.**

**What is UserDetailsService ?**

In Spring Security, the UserDetailsService interface is a core component that is used to retrieve user details during the authentication process. It is an interface with a single method, loadUserByUsername, which is responsible for returning a UserDetails object based on a username.

**What is UserDetails ?**

In Spring Security, UserDetails is an interface that represents core information about a user, such as their username, password (or other credentials), and authorities (roles). It is a central concept used during the authentication process to encapsulate information about the principal (user) attempting to authenticate.

**What is PasswordEncoder?**

In Spring Security, a PasswordEncoder is an interface used to encode (and decode) passwords. It is an essential component for securely handling user passwords, ensuring that sensitive information is not stored in plaintext. When a user registers or updates their password, the password is encoded before being stored in the system. When a user tries to log in, the entered password is encoded and compared with the stored encoded password.


















