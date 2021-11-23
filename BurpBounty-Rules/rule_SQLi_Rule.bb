[{
  "enabled": true,
  "name": "SQLi_Rule",
  "comments": "This rule searches the request for typical parameters of SQLi vulnerabilities, and if it finds them, it executes the active profiles in search of these vulnerabilities.",
  "match": [
    "true,,Passive Request,SQLi_Parameters"
  ],
  "execute": [
    "true,Profile,SQLi,All Matches",
    "true,Profile,SQLi_Collaborator,All Matches",
    "true,Profile,SQLi_TimeBased_append,All Matches",
    "true,Profile,SQLi_TimeBased_replace,All Matches"
  ]
}]