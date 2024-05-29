package com.example.sergei.repository;

import com.example.sergei.entity.MessageNewCallback;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for database entity {@code MessageNewCallback}
 *
 * @author Sergei Kudryashov
 * @see com.example.sergei.entity.MessageNewCallback
 * @see org.springframework.data.repository.CrudRepository
 * @since 1.0
 */
@Repository
public interface MessageNewCallbackRepository extends CrudRepository<MessageNewCallback, Long> {}