package step4;

 

import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Scanner;

 

//# ���� ��Ʈ�ѷ�[3�ܰ�] : ��ٱ���

 

public class Ex16_ex {

    public static void main(String[] args) {

 

        Scanner scan = new Scanner(System.in);

        

        String[] ids = {"qwer", "javaking", "abcd"};

        String[] pws = {"1111",     "2222", "3333"};

        

        int MAX_SIZE = 100;

        int[][] jang = new int[MAX_SIZE][2];

        

        int count = 0;

        

        String[] items = {"���", "�ٳ���", "����"};

        

        int log = -1;

        

        String userFile = "user.txt";

        String jangFile = "jang.txt";

        

        while(true) {

            

            System.out.println("-------------");

            for(int i=0; i<ids.length; i++) {

                System.out.print(ids[i] + " : " + pws[i] + "(");

                for(int j=0; j<count; j++) {

                    if(i == jang[j][0]) {

                        if(jang[j][1] == 1) {

                            System.out.print("���");

                        }else if(jang[j][1] == 2) {

                            System.out.print("�ٳ���");

                        }else if(jang[j][1] == 3) {

                            System.out.print("����");

                        }

                        System.out.print("/");

                    }

                }

                System.out.println(")");

            }

 

            System.out.println("-------------");

            System.out.print("���� : ");

            if(log == -1) {

                System.out.println("�α׾ƿ�");

            }else {

                System.out.println(ids[log] + "��, �α���");

            }

            System.out.println("-------------");

            

            System.out.println("[MEGA SHOP]");

            System.out.println("[1]�α���");

            System.out.println("[2]�α׾ƿ�");

            System.out.println("[3]����");

            System.out.println("[4]��ٱ���");

            System.out.println("[5]����");

            System.out.println("[6]�ε�");

            System.out.println("[0]����");

            

            System.out.print("�޴� ���� : ");

            int sel = scan.nextInt();

            

            if(sel == 1) {

                if(log == -1) {

                    System.out.print("[�α���]ID �Է� : ");

                    String id = scan.next();

                    System.out.print("[�α���]PW �Է� : ");

                    String pw = scan.next();

                    

                    for(int i=0; i<ids.length; i++) {

                        if(ids[i].equals(id) && pws[i].equals(pw)) {

                            log = i;

                        }

                    }

                    

                    if(log == -1) {

                        System.out.println("[�޼���]ID�� PW�� Ȯ�����ּ���.");

                    }else {

                        System.out.println("[�޼���]" + ids[log] + "��, ȯ���մϴ�.");

                    }

                }else {

                    System.out.println("[�޼���]���� " + ids[log] + "��, �α��� ��...");

                }

            }

            else if(sel == 2) {

                if(log != -1) {

                    log = -1;

                    System.out.println("[�޼���]�α׾ƿ� �Ǿ����ϴ�.");

                }else {

                    System.out.println("[�޼���]�α��� �� �̿밡���մϴ�.");

                }

            }

            else if(sel == 3) {

                if(log != -1) {

                    for(int i=0; i<items.length; i++) {

                        System.out.println((i+1) + "." + items[i]);

                    }

                    

                    System.out.print("[����]��ǰ��ȣ�� �����ϼ��� : ");

                    int idx = scan.nextInt();

                    

                    jang[count][0] = log;

                    jang[count][1] = idx;

                    count += 1;

                    System.out.println("[�޼���]��ٱ��Ͽ� �����ϴ�.");

                }else {

                    System.out.println("[�޼���]�α��� �� �̿밡���մϴ�.");

                }

            }

            else if(sel == 4) {

                if(log != -1) {

                    System.out.println("[" + ids[log] + "���� ��ٱ���]");

                    int j = 0;

                    for(int i=0; i<count; i++) {

                        System.out.print((j + 1) + ".");

                        if(jang[i][0] == log) {

                            if(jang[i][1] == 1) {

                                System.out.println("���");

                            }else if(jang[i][1] == 2) {

                                System.out.println("�ٳ���");

                            }else if(jang[i][1] == 3) {

                                System.out.println("����");

                            }

                            j += 1;

                        }

                    }

                }else {

                    System.out.println("[�޼���]�α��� �� �̿밡���մϴ�.");

                }

            }

            else if(sel == 5) {

                String userData = "";

                String jangData = "";

                for(int i=0; i<ids.length; i++) {

                    userData += ids[i];

                    userData += "/";

                    userData += pws[i];

                    userData += "\n";

                }

                userData = userData.substring(0, userData.length()-1);

                // System.out.println("userData = " + userData);

                

                for(int i=0; i<count; i++) {

                    jangData += jang[i][0];

                    jangData += "/";

                    jangData += jang[i][1];

                    jangData += "\n";

                }

                jangData = jangData.substring(0, jangData.length()-1);

                // System.out.println("jangData = " + jangData);

 

                FileWriter userFw = null;

                FileWriter jangFw = null;

                try {

                    userFw = new FileWriter(userFile);

                    jangFw = new FileWriter(jangFile);

                    

                    userFw.write(userData);

                    jangFw.write(jangData);

                    System.out.println("[�޼���]������ �Ϸ��Ͽ����ϴ�.");

                }catch(Exception e) {

                    e.printStackTrace();

                }finally {

                    if(userFw != null) {try {userFw.close();} catch (IOException e) {}}

                    if(jangFw != null) {try {jangFw.close();} catch (IOException e) {}}

                }

            }

            else if(sel == 6) {

                File file = new File(jangFile);

                FileReader fr = null;

                BufferedReader br = null;

                if(file.exists()) {

                    try {

                        fr = new FileReader(file);

                        br = new BufferedReader(br);

                        

                        String jangData = "";

                        while(true) {

                            String line = br.readLine();

                            if(line == null) break;

                            jangData += line;

                            jangData += "\n";

                        }

                        jangData = jangData.substring(0, jangData.length()-1);

                    }catch(Exception e) {

                        e.printStackTrace();

                    }finally {

                        if(fr != null) {try {fr.close();} catch (IOException e) {}}

                        if(br != null) {try {br.close();} catch (IOException e) {}}

                    }

                }

                

            }

            else if(sel == 0) {

                System.out.println("���α׷� ����");

                break;

            }

            

        }

        

    }

}
