(ns complex)
(defn complex
  [re im]
  ;Postać kanoniczna liczby zespolonej
  (if(and (= re 0) (>= im 0))
          (str im"j")
          (if(and (= re 0) (< im 0))
                    (str im"j")
                    (if(and (< re 0) (< im 0))
                              (str "("re""im"j)")
                            (if(and (> re 0) (< im 0))
                                    (str "("re""im"j)")
                                    (str "("re"+"im"j)"))))))

               
