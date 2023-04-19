package com.ABC123.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserStory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String storyTitle;
    private String description;
    private String assignedTeamMember;
    private boolean fetchedFromJiraAPI;
    private boolean displayedInRealTime;
    private boolean displayedReadableAndOrganized;

    public UserStory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignedTeamMember() {
        return assignedTeamMember;
    }

    public void setAssignedTeamMember(String assignedTeamMember) {
        this.assignedTeamMember = assignedTeamMember;
    }

    public boolean isFetchedFromJiraAPI() {
        return fetchedFromJiraAPI;
    }

    public void setFetchedFromJiraAPI(boolean fetchedFromJiraAPI) {
        this.fetchedFromJiraAPI = fetchedFromJiraAPI;
    }

    public boolean isDisplayedInRealTime() {
        return displayedInRealTime;
    }

    public void setDisplayedInRealTime(boolean displayedInRealTime) {
        this.displayedInRealTime = displayedInRealTime;
    }

    public boolean isDisplayedReadableAndOrganized() {
        return displayedReadableAndOrganized;
    }

    public void setDisplayedReadableAndOrganized(boolean displayedReadableAndOrganized) {
        this.displayedReadableAndOrganized = displayedReadableAndOrganized;
    }

    @Override
    public String toString() {
        return "UserStory{" +
                "id=" + id +
                ", storyTitle='" + storyTitle + '\'' +
                ", description='" + description + '\'' +
                ", assignedTeamMember='" + assignedTeamMember + '\'' +
                ", fetchedFromJiraAPI=" + fetchedFromJiraAPI +
                ", displayedInRealTime=" + displayedInRealTime +
                ", displayedReadableAndOrganized=" + displayedReadableAndOrganized +
                '}';
    }
}