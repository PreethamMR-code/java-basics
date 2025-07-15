class Contacts {

    static String personName;

    public static long getNumber(String personName) {
        long number = 0;

        if (personName.equals("abhi")) {
            number = 9876543210L;
        } 
		else if (personName.equals("anup")) {
            number = 9123456789L;
        } 
		else if (personName.equals("adithya")) {
            number = 9988776655L;
        } 
		else if (personName.equals("ankith")) {
            number = 9012345678L;
        } 
		else if (personName.equals("anusha")) {
            number = 9345678901L;
        } 
		else if (personName.equals("appaji")) {
            number = 9888777666L;
        } 
		else if (personName.equals("arun")) {
            number = 9090909090L;
        } 
		else if (personName.equals("bharath")) {
            number = 8967452301L;
        } 
		else if (personName.equals("bhavya")) {
            number = 9871234560L;
        } 
		else if (personName.equals("chethu")) {
            number = 9345012345L;
        } 
		else if (personName.equals("dada")) {
            number = 9123098765L;
        } 
		else if (personName.equals("darshan")) {
            number = 9556677889L;
        }
		else if (personName.equals("deepak")) {
            number = 9001122334L;
        }
		else if (personName.equals("dhanu")) {
            number = 8888999900L;
        } 
		else if (personName.equals("dilip")) {
            number = 9898989898L;
        } 
		else if (personName.equals("eshu")) {
            number = 9234567890L;
        } 
		else if (personName.equals("gagan")) {
            number = 9765432101L;
        } 
		else if (personName.equals("gopinath")) {
            number = 9345671234L;
        } 
		else if (personName.equals("guru")) {
            number = 9432109876L;
        } 
		else if (personName.equals("harish")) {
            number = 9383827364L;
        } 
		else if (personName.equals("harsha")) {
            number = 9856231470L;
        } 
		else if (personName.equals("jaideep")) {
            number = 9870001234L;
        } 
		else if (personName.equals("jaya")) {
            number = 9988001122L;
        } 
		else if (personName.equals("jeevan")) {
            number = 9355123498L;
        } 
		else if (personName.equals("karthi")) {
            number = 9123987654L;
        } 
		else if (personName.equals("kiran")) {
            number = 9494949494L;
        } 
		else if (personName.equals("kruthik")) {
            number = 9867543212L;
        } 
		else if (personName.equals("lohith")) {
            number = 9900112233L;
        } 
		else if (personName.equals("lokesh")) {
            number = 9643001122L;
        } 
		else if (personName.equals("madu")) {
            number = 9787894561L;
        } 
		else if (personName.equals("mahantesh")) {
            number = 9300456781L;
        } 
		else if (personName.equals("manja")) {
            number = 9365478999L;
        } 
		else if (personName.equals("manoj")) {
            number = 9100123456L;
        }
		else if (personName.equals("manu")) {
            number = 9877891234L;
        } 
		else if (personName.equals("pachii")) {
            number = 9034567890L;
        } 
		else if (personName.equals("pavan")) {
          
		  number = 9678452301L;
        }
		else if (personName.equals("prajwal")) {
            number = 9523607412L;
        } 
		else if (personName.equals("priya")) {
            number = 9812345678L;
        } 
		else if (personName.equals("rahul")) {
            number = 9001234567L;  
        }
		else if (personName.equals("suraj")) {
            number = 9333444555L;
        }
		else if (personName.equals("tarun")) {
            number = 9766009988L;
        }
		else if (personName.equals("varu")) {
            number = 9654789652L;
        }
		else if (personName.equals("yeahwanth")) {
            number = 9345896712L;
        } 
		else if (personName.equals("yogi")) {
            number = 9898234561L;
        }
		else if (personName.equals("suchi")) {
            number = 9111222333L;
        }
		else if (personName.equals("subhash")) {
            number = 9777666555L;
        }
		else if (personName.equals("siddu")) {
            number = 9344567890L;
        } 
		else if (personName.equals("pradee")) {
            number = 9899765432L;
        }
		else if (personName.equals("monish")) {
            number = 9123891273L;
        } 
		else {
            System.out.println("They are not In Your Contact");
        }

        return number;
    }

    public static void main(String[] args) {
        long mobileNo = getNumber("monish");
        System.out.println("You Searched Mobile Number is : " + mobileNo);
    }
}
