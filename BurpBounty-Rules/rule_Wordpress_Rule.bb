[{
  "enabled": true,
  "name": "Wordpress_Rule",
  "comments": "This rule, try to detect wordpress and execute common vulnerabilities in this framework",
  "match": [
    "true,,Passive Response,Wordpress detection"
  ],
  "execute": [
    "true,Profile,Wordpress_user_enum_oembed,First Match",
    "true,Profile,Wordpress_users_enum_yoastseo,First Match",
    "true,Profile,Wordpress_user_enum_json,First Match",
    "true,Profile,Wordpress_directory_listing,First Match"
  ]
}]