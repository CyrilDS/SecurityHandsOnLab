package fr.formation.hol.spring.sec.entities;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * @author Cyril
 *
 */
@Entity
public class UserAccount extends AbstractEntity {

    private static final long serialVersionUID = 1753268919123139519L;
    
    @Column(nullable= false, unique=true)
    private String username;

    @Column(nullable = false)
    private String password;
    
    @Column(nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private Role role = Role.ROLE_USER;

    @Column(length= 1, nullable = false)
    @Convert(converter = BooleanConverter.class)
    private boolean accountNonExpired = true;

    @Column(length=1, nullable = false)
    @Convert(converter = BooleanConverter.class)
    private boolean accountNonLocked = true;
    
    @Column(length=1 ,nullable = false) 
    @Convert(converter = BooleanConverter.class)
    private boolean credentialdsNonExpired = true;

    @Column(length=1,nullable =false )
    @Convert(converter = BooleanConverter.class)
    private boolean enabled = true;

    public UserAccount() {
    }

    
    public String getUsername() {
        return username;
    }

    
    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    
    public Role getRole() {
        return role;
    }

    
    public void setRole(Role role) {
        this.role = role;
    }

    
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    
    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    
    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    
    public boolean isCredentialdsNonExpired() {
        return credentialdsNonExpired;
    }

    
    public void setCredentialdsNonExpired(boolean credentialdsNonExpired) {
        this.credentialdsNonExpired = credentialdsNonExpired;
    }

    
    public boolean isEnabled() {
        return enabled;
    }

    
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }


    @Override
    public String toString() {
	return "UserAccount [username=" + username + ", password=" + password
		+ ", role=" + role + ", accountNonExpired=" + accountNonExpired
		+ ", accountNonLocked=" + accountNonLocked
		+ ", credentialdsNonExpired=" + credentialdsNonExpired
		+ ", enabled=" + enabled + "]";
    }
    
    
}
