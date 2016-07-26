package note1;

import java.io.*;

public class Main {
	public static void main(String args[]){
		System.out.println("Note 1: 註解");
		System.out.println("單行註解: //");
		System.out.println("多行註解: /* ... */");
		System.out.println("說明檔註解: /** ... */");
		//單行註解
		/* 多
		 * 行
		 * 註
		 * 解
		 */
		/**說明檔註解
		 * 此註解可由javadoc應用程式讀取並轉換成說明檔(Readme)
		 * javadoc可識別註解中用@標記的特殊變數並將註解放入它所生成的HTML檔
		 * 通常用於類別、介面、變數、方法的前面
		 */
	}
}
