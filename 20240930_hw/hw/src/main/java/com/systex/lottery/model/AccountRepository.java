package com.systex.lottery.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


// <class, s_num>
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

	public Account findByAcc(String acc);
}