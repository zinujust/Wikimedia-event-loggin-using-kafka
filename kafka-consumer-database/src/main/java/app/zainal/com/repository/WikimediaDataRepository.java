package app.zainal.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.zainal.com.entity.WikimediaData;

@Repository
public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long>{

}
