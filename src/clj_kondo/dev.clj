(ns clj-kondo.dev
  (:require [clj-kondo.impl.hooks :as hooks]
            [sci.core :as sci]))

(defn reset-ctx!
  "Re-initializes the SCI ctx"
  []
  (vreset! hooks/sci-ctx (hooks/new-ctx)))

(defn eval-str-in-ctx!
  "Evaluates string in SCI ctx"
  [s]
  (sci/eval-string* @hooks/sci-ctx s))
