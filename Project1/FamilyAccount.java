class  FamilyAccount{
	public static void main(String[] args){
		boolean isFlag = true;
		String details = "��֧\t�˻����\t��֧���\t˵       ��\n";//record income and expenditure
		int balance = 10000;
		while(isFlag){
			System.out.println("-------------------��ͥ��֧�������--------------------\n");
			System.out.println("                       1 ��֧��ϸ");
			System.out.println("                       2 �Ǽ�����");
			System.out.println("                       3 �Ǽ�֧��");
			System.out.println("                       4 �˳�");
			System.out.print("                          ��ѡ��(1-4):");
			char selection = Utility.readMenuSelection();//��ȡ�û���ѡ��1-4
			switch(selection){
				case '1':
				      System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
				     
					  System.out.println(details);
					  System.out.println("--------------------------------------------------");
				      break;
				case '2':
				      //System.out.println("2.�Ǽ�����");
				      System.out.print("����������:");
					  int money = Utility.readNumber();
                      System.out.print("��������˵��:");
					  String instruction = Utility.readString();
					  balance +=money;
                      details+=("����\t"+balance+"\t\t"+money+"\t\t"+instruction+"\n");
					  System.out.println("---------------------�Ǽ����-----------------");
				      break;
				case '3':
			          //System.out.println("3.�Ǽ�֧��");
				      System.out.print("����֧�����:");
					  int money1 = Utility.readNumber();
                      System.out.print("����֧��˵��:");
					  String instruction1 = Utility.readString();
					  if(balance>=money1){
						balance -=money1;
						details+=("֧��\t"+balance+"\t\t"+money1+"\t\t"+instruction1+"\n");
					  }else{
						System.out.println("֧�������˻���ȣ�֧��ʧ��");
					  }
                      
					  System.out.println("---------------------�Ǽ����-----------------");
				      break;
				case '4':
					  //System.out.println("4.��    ��");
				      System.out.print("ȷ���Ƿ��˳���Y/N��:");
					  char isExit = Utility.readConfirmSelection();
					  if (isExit =='Y'){
						  isFlag = false;
					  }
				      break;
			}
 
		}
	}
}
