public class items {
        private
        String weaponName;
        int attack;
        int defense;
        int speech;
        int health;

        items(String name, int one, int two , int three, int four){
            setName(name);
            setAttack(one);
            setDefense(two);
            setSpeech(three);
            setHealth(four);

            /** Create object from the above attributes*/
        }

        public void setName(String name){
            weaponName = name;
        }

        public void setAttack(int itemAttack){
            attack = itemAttack;
        }

        public void setDefense(int itemDefense){
            defense = itemDefense;
        }

        public void setSpeech(int itemSpeech){
            speech = itemSpeech;
        }

        public void setHealth(int itemHealth){
            health = itemHealth;
        }



}
