package com.ABC123.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStoryRepository extends JpaRepository<UserStory, Long> {
    UserStory findByStoryTitle(String storyTitle);
    UserStory findByDescription(String description);
    UserStory findByAssignedTeamMember(String assignedTeamMember);
    List<UserStory> findByFetchedFromJiraAPI(boolean fetchedFromJiraAPI);
    List<UserStory> findByDisplayedInRealTime(boolean displayedInRealTime);
    List<UserStory> findByDisplayedReadableAndOrganized(boolean displayedReadableAndOrganized);
    void deleteByStoryTitle(String storyTitle);
    void deleteByDescription(String description);
    void deleteByAssignedTeamMember(String assignedTeamMember);
}