package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team team2;
    Team team3;
    Team team4;
    int notTeam = 0;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");  
        team2 = new Team("test-team");
        team3 = new Team("test-team2");
        team4 = new Team("test-team");
        team4.addMember("member"); 
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_correct_value() {
        assert(team.equals(team));
        assert(team.equals(team2));
        assert(!team.equals(team3));
        assert(!team.equals(team4));
        assert(!team.equals(notTeam));
    }

    @Test
    public void hashCode_returns_correct_value() {
        int result = team.hashCode();
        int expectedResult = -1226298695;

        assertEquals(result, expectedResult);
        assertEquals(result, team.hashCode());
        assert(team.hashCode() == team2.hashCode());
        assert(team.hashCode() != team4.hashCode());
    }

}
