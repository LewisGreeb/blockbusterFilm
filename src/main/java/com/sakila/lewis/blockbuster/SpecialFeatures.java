package com.sakila.lewis.blockbuster;

public enum SpecialFeatures {
    TRAILERS {
        public String toString() {
            return "Trailers";
        }
    },
    COMMENTARIES {
        public String toString() {
            return "Commentaries";
        }
    },
    DELETEDSCENE {
        public String toString() {
            return "Deleted Scenes";
        }
    },
    BEHINDTHESCENES {
        public String toString() {
            return "Behind the Scenes";
        }
    }
}
