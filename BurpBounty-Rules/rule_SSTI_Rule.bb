[{
  "enabled": true,
  "name": "SSTI_Rule",
  "comments": "This rule searches the request for typical parameters of SSTI vulnerabilities, and if it finds them, it executes the active profiles in search of this vulnerabilities.",
  "match": [
    "true,,Passive Request,SSTI_Parameters"
  ],
  "execute": [
    "true,Profile,SSTI,All Matches"
  ]
}]