@tag
Feature: Calculator

Scenario: calculate square root of a divided by b
Given Two input values, 4 and 1
When I calculate the square root of a divided by b
Then I expect the result to be 7

Scenario Outline: calculate square root of a divided by b
Given Two input values, <a> and <b>
When I calculate the square root of a divided by b
Then I expect the result to be <result>

Examples:
| a | b | result |
| 4 | 1 | 2      |
| 36| 4 | 3      |
| 32| 2 | 4      |
| 72| 8 | 3      |