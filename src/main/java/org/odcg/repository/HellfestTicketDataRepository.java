package org.odcg.repository;

import org.odcg.domain.TicketData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by shoun on 09/01/2017.
 */
@Repository
public interface HellfestTicketDataRepository extends JpaRepository<TicketData, Integer> {
}
