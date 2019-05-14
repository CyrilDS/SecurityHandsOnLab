package fr.formation.hol.spring.sec.dtos;

import javax.persistence.Column;

import fr.formation.hol.spring.sec.entities.Role;

public class UserAccountCreateDto {

    private String username;

    private String password;
    
    private Role role = Role.ROLE_USER;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked = true;
    
    private boolean credentialdsNonExpired = true;

    private boolean enabled = true;
    
    public UserAccountCreateDto() {
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
    
    
}
