[
  {
    "enabled": true,
    "name": "Firebase Database Rule",
    "comments": "This rule try to detect *.firebaseio.com host and test to Open Firebase Database vulnerability",
    "match": [
      "true,,Passive Request,Firebase Database"
    ],
    "execute": [
      "true,Profile,Open Firebase Database,First Match"
    ]
  }
]