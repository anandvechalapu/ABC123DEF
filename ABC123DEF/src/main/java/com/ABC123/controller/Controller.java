package com.ABC123.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ABC123.model.UserStory;
import com.ABC123.model.JiraSoftware;
import com.ABC123.service.UserStoryService;
import com.ABC123.service.JiraSoftwareService;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private UserStoryService userStoryService;

    @Autowired
    private JiraSoftwareService jiraSoftwareService;

    @GetMapping("/userStoryByTitle/{storyTitle}")
    public UserStory getUserStoryByStoryTitle(@PathVariable String storyTitle) {
        return userStoryService.findByStoryTitle(storyTitle);
    }

    @GetMapping("/userStoryByDescription/{description}")
    public UserStory getUserStoryByDescription(@PathVariable String description) {
        return userStoryService.findByDescription(description);
    }

    @GetMapping("/userStoryByAssignedTeamMember/{assignedTeamMember}")
    public UserStory getUserStoryByAssignedTeamMember(@PathVariable String assignedTeamMember) {
        return userStoryService.findByAssignedTeamMember(assignedTeamMember);
    }

    @GetMapping("/userStoriesByFetchedFromJiraAPI/{fetchedFromJiraAPI}")
    public List<UserStory> getUserStoriesByFetchedFromJiraAPI(@PathVariable boolean fetchedFromJiraAPI) {
        return userStoryService.findByFetchedFromJiraAPI(fetchedFromJiraAPI);
    }

    @GetMapping("/userStoriesByDisplayedInRealTime/{displayedInRealTime}")
    public List<UserStory> getUserStoriesByDisplayedInRealTime(@PathVariable boolean displayedInRealTime) {
        return userStoryService.findByDisplayedInRealTime(displayedInRealTime);
    }

    @GetMapping("/userStoriesByDisplayedReadableAndOrganized/{displayedReadableAndOrganized}")
    public List<UserStory> getUserStoriesByDisplayedReadableAndOrganized(@PathVariable boolean displayedReadableAndOrganized) {
        return userStoryService.findByDisplayedReadableAndOrganized(displayedReadableAndOrganized);
    }

    @DeleteMapping("/userStoryByTitle/{storyTitle}") 
    public void deleteUserStoryByStoryTitle(@PathVariable String storyTitle) {
        userStoryService.deleteByStoryTitle(storyTitle);
    }

    @DeleteMapping("/userStoryByDescription/{description}") 
    public void deleteUserStoryByDescription(@PathVariable String description) {
        userStoryService.deleteByDescription(description);
    }

    @DeleteMapping("/userStoryByAssignedTeamMember/{assignedTeamMember}") 
    public void deleteUserStoryByAssignedTeamMember(@PathVariable String assignedTeamMember) {
        userStoryService.deleteByAssignedTeamMember(assignedTeamMember);
    }

    @GetMapping("/jiraSoftware")
    public List<JiraSoftware> getAllJiraSoftware() {
        return jiraSoftwareService.getAllJiraSoftware();
    }

    @GetMapping("/jiraSoftwareByUserName/{userName}")
    public Optional<JiraSoftware> getJiraSoftwareByUserName(@PathVariable String userName) {
        return jiraSoftwareService.getJiraSoftwareByUserName(userName);
    }

    @GetMapping("/jiraSoftwareByUrl/{url}")
    public Optional<JiraSoftware> getJiraSoftwareByUrl(@PathVariable