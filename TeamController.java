package com.example.demo.controller;

import com.example.demo.model.Team;
import com.example.demo.service.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService service;

    public TeamController(TeamService service) {
        this.service = service;
    }

    @GetMapping
    public List<Team> getAllTeams() {
        return service.getAllTeams();
    }

    @PostMapping
    public Team createTeam(@RequestBody Team team) {
        return service.createTeam(team);
    }

    @GetMapping("/{id}")
    public Team getTeam(@PathVariable String id) {
        return service.getTeamById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable String id) {
        service.deleteTeam(id);
    }

}
