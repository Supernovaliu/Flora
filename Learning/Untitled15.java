class  IfElse 
{
	public static void main(String[] args){
		
		int heartBeats = 79;
		if (heartBeats<60||heartBeats>100)
		{
			System.out.println("��Ҫ����һ�����");
		}
			System.out.println("������");

            int age = 23;
			if(age <18){
				System.out.println("�㻹���Կ�����Ƭ");
			}else{
				System.out.println("����Կ����˵�Ӱ��");
			}
			if(age<0){
					
                     System.out.println("����������ݷǷ�");

				}else if(age<18){
					
					System.out.println("������ʱ��");
				}else if(age<35){
					System.out.println("��׳��ʱ��");
				}else if(age<60){
					System.out.println("����ʱ��");
				}else if (age<120)
				{
					System.out.println("����ʱ��");
				}else{
					System.out.println("����Ҫ����ѽ");
				}




	}
}