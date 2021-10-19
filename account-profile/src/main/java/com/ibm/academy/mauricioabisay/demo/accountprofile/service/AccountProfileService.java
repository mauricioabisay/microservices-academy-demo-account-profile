package com.ibm.academy.mauricioabisay.demo.accountprofile.service;

import java.util.List;
import java.util.Optional;

import com.ibm.academy.mauricioabisay.demo.accountprofile.model.AccountProfile;
import com.ibm.academy.mauricioabisay.demo.accountprofile.repository.AccountProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountProfileService {
    @Autowired
    private AccountProfileRepository repo;

    public Iterable<AccountProfile> list() {
        return repo.findAll();
    }

    public Optional<AccountProfile> getById(long id) {
        return repo.findById(id);
    }

    public List<AccountProfile> listByRequest(String usage, int age, double monthlyIncome) {
        return repo.findAllByUsageAndAgeRangeAndIncomeRange(usage, age, monthlyIncome);
    }

    public AccountProfile create(AccountProfile entity) {
        return repo.save(entity);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
