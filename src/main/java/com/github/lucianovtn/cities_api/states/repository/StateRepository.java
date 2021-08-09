package com.github.lucianovtn.cities_api.states.repository;

import com.github.lucianovtn.cities_api.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
