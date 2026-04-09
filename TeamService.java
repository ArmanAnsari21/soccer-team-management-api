package com.example.demo.service;

import com.example.demo.model.Team;
import com.example.demo.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepository repository;

    public TeamService(TeamRepository repository) {
        this.repository = repository;
    }

    public List<Team> getAllTeams() {
        return repository.findAll();
    }

    public Team createTeam(Team team) {
        return repository.save(team);
    }

    public Team getTeamById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteTeam(String id) {
        repository.deleteById(id);
    }

}
