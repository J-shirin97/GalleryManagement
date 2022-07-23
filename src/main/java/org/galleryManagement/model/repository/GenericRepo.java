package org.galleryManagement.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepo<T, Pk> extends JpaRepository<T, Pk> {


}
