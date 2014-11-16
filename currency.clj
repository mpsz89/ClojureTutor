(ns currency)

(defn pln_to_euro [pln]
    (if (>= pln 0) (* pln 0.24) "Value of currency error!"))
    
(defn euro_to_pln [euro]
    (if (>= euro 0) (* euro 4.20) "Value of currency error!"))
   
(defn pln_to_gbp [pln]
    (if (>= pln 0) (* pln 0.70) "Value of currency error!"))
    
(defn gbp_to_pln [gbp]
    (if (>= gbp 0) (* gbp 5.28) "Value of currency error!"))
   
(defn gbp_to_euro [gbp]
    (if (>= gbp 0) (* gbp 1.26) "Value of currency error!"))
    
(defn euro_to_gbp [euro]
    (if (>= euro 0) (* euro 2.95) "Value of currency error!"))

(defn pln_to_chf [pln]
    (if (>= pln 0) (* pln 0.29) "Value of currency error!"))
    
(defn chf_to_pln [chf]
    (if (>= chf 0) (* chf 3.45) "Value of currency error!"))
   
(defn euro_to_chf [euro]
    (if (>= euro 0) (* euro 1.21) "Value of currency error!"))
    
(defn chf_to_euro [chf]
    (if (>= chf 0) (* chf 0.82) "Value of currency error!"))
   
(defn gbp_to_chf [gbp]
    (if (>= gbp 0) (* gbp 1.52) "Value of currency error!"))
    
(defn chf_to_gbp [chf]
    (if (>= chf 0) (* chf 0.66) "Value of currency error!"))

(defn currency [from to value]
  (if (and (= from "pln") (= to "euro")) (str value" pln = "(pln_to_euro value)" euro")
    (if (and (= from "euro") (= to "pln")) (str value" euro = "(euro_to_pln value)" pln")
      (if (and (= from "pln") (= to "gbp")) (str value" pln = "(pln_to_gbp value)" gbp")
        (if (and (= from "gbp") (= to "pln")) (str value" gbp = "(gbp_to_pln value)" pln")
          (if (and (= from "euro") (= to "gbp")) (str value" euro = "(euro_to_gbp value)" gbp")
            (if (and (= from "gbp") (= to "euro")) (str value" gbp = "(gbp_to_euro value)" euro")
              (if (and (= from "chf") (= to "pln")) (str value" chf = "(chf_to_pln value)" pln")
                (if (and (= from "pln") (= to "chf")) (str value" pln = "(pln_to_chf value)" chf")
                  (if (and (= from "chf") (= to "euro")) (str value" chf = "(chf_to_euro value)" euro")
                    (if (and (= from "euro") (= to "chf")) (str value" euro = "(euro_to_chf value)" chf")
                      (if (and (= from "chf") (= to "gbp")) (str value" chf = "(chf_to_gbp value)" gbp")
                        (if (and (= from "gbp") (= to "chf")) (str value" gbp = "(gbp_to_chf value)" chf"))))))))))))))
