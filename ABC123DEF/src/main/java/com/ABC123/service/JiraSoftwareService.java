package com.ABC123.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ABC123.model.JiraSoftware;
import com.ABC123.repository.JiraSoftwareRepository;

@Service
public class JiraSoftwareService {

    @Autowired
    private JiraSoftwareRepository jiraSoftwareRepository;

    public List<JiraSoftware> getAllJiraSoftware() {
        return jiraSoftwareRepository.findAll();
    }

    public Optional<JiraSoftware> getJiraSoftwareByUserName(String userName) {
        return jiraSoftwareRepository.findByUserName(userName);
    }

    public Optional<JiraSoftware> getJiraSoftwareByUrl(String url) {
        return jiraSoftwareRepository.findByUrl(url);
    }

    public void deleteJiraSoftwareByUserName(String userName) {
        jiraSoftwareRepository.deleteByUserName(userName);
    }

    public void deleteJiraSoftwareByUrl(String url) {
        jiraSoftwareRepository.deleteByUrl(url);
    }

    public void saveJiraSoftware(JiraSoftware jiraSoftware) {
        jiraSoftwareRepository.save(jiraSoftware);
    }
}