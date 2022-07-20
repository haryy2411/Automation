Feature: Verifying Adactin Hotel details

  Scenario Outline: Verifying Adactin Hotel login page with valid credentials
    Given User is on Adactin Hotel login page
    When User should enter valid "<username>" , "<password>" and click login
    Then User should verify after login "Hello harry786!"
    When User should enter search hotel details "<location>","<hotels>","<room_type>","<room_nos>","<datepick_in>","<datepick_out>","<adult_room>","<child_room>"
    When User should select hotel by clicking radio button and click continue
    When User should enter valid details "<first_name>","<last_name>","<address>","<cc_num>","<cc_type>","<cc_exp_month>","<cc_exp_year>","<cc_cvv>"
    Then User should print the booking id

    Examples: 
      | username        | password  | location | hotels        | room_type    | room_nos  | datepick_in | datepick_out | adult_room | child_room | first_name | last_name | address             | cc_num           | cc_type          | cc_exp_month | cc_exp_year | cc_cvv |
      | luciferdevil786 | 123456789 | London   | Hotel Creek   | Super Deluxe | 9 - Nine  | 05/07/2022  | 04/07/2022   | 3 - Three  | 3 - Three  | Hareesh    | Kumar     | 2nd st Anna nagar   | 1472583691234759 | American Express | April        |        2020 |    457 |
      | luciferdevil786 | 123456789 | Brisbane | Hotel Cornice | Standard     | 3 - Three | 08/07/2022  | 09/07/2022   | 2 - Two    | 1 - One    | Joseph     | kurvilla  | 1st main pallavaram | 1472583691234759 | American Express | June         |        2019 |    321 |
      | luciferdevil786 | 123456789 | London   | Hotel Cornice | Super Deluxe | 9 - Nine  | 10/07/2022  | 11/07/2022   | 1 - One    | 1 - One    | Vinayak    | shaa      | 2st Anna nagar west | 1472583691234758 | American Express | April        |        2014 |    897 |
      | luciferdevil786 | 123456789 | Adelaide | Hotel Hervey  | Standard     | 4 - Four  | 11/07/2022  | 12/07/2022   | 2 - Two    | 1 - One    | vinu       | karan     | 1st Anna nagar east | 5572583691234759 | American Express | April        |        2018 |    421 |
      | luciferdevil786 | 123456789 | London   | Hotel Cornice | Deluxe       | 3 - Three | 12/07/2022  | 13/07/2022   | 3 - Three  | 1 - One    | Liya       | khan      | 3rd main cross road | 1472583691234797 | American Express | April        |        2012 |    666 |
      | luciferdevil786 | 123456789 | Paris    | Hotel Cornice | Deluxe       | 3 - Three | 06/07/2022  | 07/07/2022   | 2 - Two    | 3 - Three  | vive       | siva      | 1st Anna nagar      | 1472583691234752 | American Express | April        |        2014 |    457 |
      | luciferdevil786 | 123456789 | Sydney   | Hotel Cornice | Double       | 4 - Four  | 14/07/2022  | 15/07/2022   | 2 - Two    | 1 - One    | pravin     | Kumar     | 1st  Anna nagar     | 2272583691234147 | American Express | April        |        2014 |    111 |
      | luciferdevil786 | 123456789 | Adelaide | Hotel Hervey  | Super Deluxe | 3 - Three | 04/07/2022  | 04/07/2022   | 2 - Two    | 1 - One    | joseph     | vivan     | 1st  ashok nagar    | 1472583691234759 | American Express | April        |        2014 |    457 |
      | luciferdevil786 | 123456789 | London   | Hotel Cornice | Standard     | 3 - Three | 04/07/2022  | 04/07/2022   | 3 - Three  | 1 - One    | nisha      | vani      | 1st  Chromepet      | 1662583691234759 | American Express | April        |        2014 |    124 |
      | luciferdevil786 | 123456789 | Sydney   | Hotel Creek   | Super Deluxe | 4 - Four  | 16/07/2022  | 18/07/2022   | 2 - Two    | 1 - One    | varun      | ansu      | 1st  new york       | 7772583691234139 | American Express | April        |        2014 |    555 |
