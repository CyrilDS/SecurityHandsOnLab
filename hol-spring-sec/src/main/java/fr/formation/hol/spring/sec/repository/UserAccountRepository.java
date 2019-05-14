package fr.formation.hol.spring.sec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.hol.spring.sec.entities.UserAccount;


public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

    UserAccount findByUsername(String username);
}
