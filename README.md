# twitter-stream-producer

## Usage
Open a repl to simulate a consumer

    (def tweets (read-string (slurp "http://localhost:3000/tweets/300")))
    (map #(get-in % [:entities :user_mentions]) (take 20 tweets))
    =>
    (nil
     nil
     nil
     nil
     [{:screen_name "noticiasvzla360",
       :name "Noticias Venezuela",
       :id 879916088317947904,
       :id_str "879916088317947904",
       :indices [3 19]}]
     nil
     []
     [{:screen_name "hameed__4", :name "حمد الراجحي", :id 969162543985029121, :id_str "969162543985029121", :indices [0 10]}]
     [{:screen_name "Anwar2551", :name "ولد القحل", :id 845940061560557568, :id_str "845940061560557568", :indices [3 13]}]
     [{:screen_name "chieko_0008", :name "ちえ子✧執行six", :id 1399447998, :id_str "1399447998", :indices [3 15]}]
     [{:screen_name "zvknoos", :name "Zaknoos", :id 953771648389435393, :id_str "953771648389435393", :indices [3 11]}]
     [{:screen_name "escbayanlar7",
       :name "Sultangazi Eskort",
       :id 930406002221916166,
       :id_str "930406002221916166",
       :indices [0 13]}]
     [{:screen_name "xexu_fernandez",
       :name "Me llamo Xexu pero tú puedes llamarme esta noche",
       :id 308155457,
       :id_str "308155457",
       :indices [3 18]}]
     [{:screen_name "knockknock0408", :name "'KNOCK KNOCK!'", :id 1627921021, :id_str "1627921021", :indices [3 18]}]
     [{:screen_name "Yzoy11Ci72t6ywM", :name "アメリア", :id 2978850110, :id_str "2978850110", :indices [0 16]}]
     [{:screen_name "obaa12345", :name "..﴿ الـعـوبا ﴾", :id 4795430666, :id_str "4795430666", :indices [0 10]}]
     [{:screen_name "btsvotingteam",
       :name "BTS VotingTeam",
       :id 921338490775773184,
       :id_str "921338490775773184",
       :indices [3 17]}
      {:screen_name "BTS_twt", :name "방탄소년단", :id 335141638, :id_str "335141638", :indices [64 72]}]
     [{:screen_name "yoxrgravity", :name "mars.", :id 4553422220, :id_str "4553422220", :indices [3 15]}]
     [{:screen_name "Zeyad_jehani", :name "#زياد_الجهني", :id 490564280, :id_str "490564280", :indices [0 13]}]
     [])
    
**Listing available keys**

    (read-string (slurp "http://localhost:3000/tweets/keys"))
    =>
    (:quote_count
     :in_reply_to_screen_name
     :is_quote_status
     :coordinates
     :filter_level
     :in_reply_to_status_id_str
     :place
     :timestamp_ms
     :possibly_sensitive
     :quoted_status
     :geo
     :in_reply_to_status_id
     :extended_tweet
     :entities
     :retweeted_status
     :delete
     :source
     :quoted_status_id
     :lang
     :in_reply_to_user_id_str
     :id
     :contributors
     :extended_entities
     :display_text_range
     :truncated
     :retweeted
     :in_reply_to_user_id
     :id_str
     :favorited
     :quoted_status_id_str
     :user
     :reply_count
     :retweet_count
     :favorite_count
     :created_at
     :text)
     
## Testing
**JSON**
    
    curl -H "Accept: application/json" http://localhost:3000/tweets/10