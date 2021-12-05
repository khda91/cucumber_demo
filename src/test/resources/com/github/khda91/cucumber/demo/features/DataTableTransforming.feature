Feature: DataTable Transforming

  Scenario: Example 1
    Given I have data table with following data
      | firstName | lastName | middleName  |
      | Vasiliev  | Vasiliy  | Vasilievich |

  Scenario: Example 2
    Given I have data table with following data
      | firstName | lastName | middleName  | age |
      | Vasiliev  | Vasiliy  | Vasilievich | 21  |

  Scenario: Example 3
    Given I have data table with following set of data
      | firstName | lastName | middleName  | age |
      | Vasiliev  | Vasiliy  | Vasilievich | 21  |
      | Ivanov    | Ivan     | Ivanovich   | 24  |
      | Petrov    | Petr     | Petrovich   | 22  |


  Scenario: Example 4
    Given I have data table with following data
      | first_name | lastName | middleName  | age |
      | Vasiliev   | Vasiliy  | Vasilievich | 21  |

