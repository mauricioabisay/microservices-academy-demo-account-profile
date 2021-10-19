package com.ibm.academy.mauricioabisay.demo.accountprofile.repository;

import java.util.List;

import com.ibm.academy.mauricioabisay.demo.accountprofile.model.AccountProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountProfileRepository extends JpaRepository<AccountProfile, Long> {
    List<AccountProfile> findAllByMainUsageAndMonthlyIncomeLowerLessThanEqualAndMonthlyIncomeUpperGreaterThanEqualAndAgeLowerLessThanEqualAndAgeUpperGreaterThanEqual(String usage, double monthlyIncomeForLower, double monthlyIncomeForUpper, int ageLower, int ageUpper);

    @Query( "SELECT a from AccountProfile a " +
            " WHERE a.mainUsage = :usage " +
            "   AND (a.ageLower <= :age AND :age <= a.ageUpper) " +
            "   AND (a.monthlyIncomeLower <= :income AND (:income <= a.monthlyIncomeUpper OR a.monthlyIncomeUpper = -1.00)) "
    )
    List<AccountProfile> findAllByUsageAndAgeRangeAndIncomeRange(@Param("usage") String usage, @Param("age") int age, @Param("income") double income);
}
