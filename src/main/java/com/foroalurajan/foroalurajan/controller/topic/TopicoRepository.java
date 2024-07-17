package com.foroalurajan.foroalurajan.controller.topic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicoRepository extends JpaRepository<Topico,Long> {

    @Query("Select t FROM Topic t WHERE t.title=:paramTitle or t.message=:paramMessage")
    public Topico findTopicByTitleOrMessage(String paramTitle, String paramMessage);
}
