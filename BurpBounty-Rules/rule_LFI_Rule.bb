[{
  "enabled": true,
  "name": "LFI_Rule",
  "comments": "This rule searches the request for typical parameters of LFI vulnerabilities, and if it finds them, it executes the active profiles in search of these vulnerabilities.",
  "match": [
    "true,,Passive Request,LFI_RFI_Parameters",
    "true,Or,Passive Request,URL_Path_as_a_Value"
  ],
  "execute": [
    "true,Profile,PathTraversal_Linux,All Matches",
    "true,Profile,PathTraversal_Windows,All Matches"
  ]
}]