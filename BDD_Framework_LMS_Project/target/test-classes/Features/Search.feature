Feature: Search Program

  Scenario Outline: Validate Search Feature
    Given User is logged with valid <username> and <password> on to LMS website
    When User is on Program page
    Then Text box used for search has text as "Search..."
    Examples:
      | username | password   |
      | "User"   | "Password" |

  Scenario Outline: Search Program By Name
   Given User is on Program page
   When User enters <namephrase> into search box.
    Then Entries for status count are shown.
    Examples:
      | namephrase|
      |"SDET"     |

  Scenario Outline: Search Program By Name
    Given User is on Program page
    When User enters <descriptionphrase> into search box.
    Then Entries for status count are shown.
    Examples:
      | descriptionphrase|
      |"JAVA"     |

  Scenario Outline: Search Program By Name
    Given User is on Program page
    When User enters <status> into search box.
    Then Entries for status count are shown.
    And Close Browser
    Examples:
      | status|
      |"Active"|