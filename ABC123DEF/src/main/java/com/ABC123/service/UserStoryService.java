package com.ABC123.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ABC123.model.UserStory;
import com.ABC123.repository.UserStoryRepository;

@Service
public class UserStoryService {
    @Autowired
    private UserStoryRepository userStoryRepository;

    public UserStory findByStoryTitle(String storyTitle) {
        return userStoryRepository.findByStoryTitle(storyTitle);
    }

    public UserStory findByDescription(String description) {
        return userStoryRepository.findByDescription(description);
    }

    public UserStory findByAssignedTeamMember(String assignedTeamMember) {
        return userStoryRepository.findByAssignedTeamMember(assignedTeamMember);
    }

    public List<UserStory> findByFetchedFromJiraAPI(boolean fetchedFromJiraAPI) {
        return userStoryRepository.findByFetchedFromJiraAPI(fetchedFromJiraAPI);
    }

    public List<UserStory> findByDisplayedInRealTime(boolean displayedInRealTime) {
        return userStoryRepository.findByDisplayedInRealTime(displayedInRealTime);
    }

    public List<UserStory> findByDisplayedReadableAndOrganized(boolean displayedReadableAndOrganized) {
        return userStoryRepository.findByDisplayedReadableAndOrganized(displayedReadableAndOrganized);
    }

    public void deleteByStoryTitle(String storyTitle) {
        userStoryRepository.deleteByStoryTitle(storyTitle);
    }

    public void deleteByDescription(String description) {
        userStoryRepository.deleteByDescription(description);
    }

    public void deleteByAssignedTeamMember(String assignedTeamMember) {
        userStoryRepository.deleteByAssignedTeamMember(assignedTeamMember);
    }
}