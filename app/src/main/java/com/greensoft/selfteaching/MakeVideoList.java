
package com.greensoft.selfteaching;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================
	public static void createPlayListForVideo(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================
	public static void createCategoryForWebsite(String category_name, Integer drawable, String url){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("url", url);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================
	public static void createCategoryForPDF(String category_name, Integer drawable, String pdfAssetName){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("pdfAssetName", pdfAssetName);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================


	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		/*
		//========================Video Item Category
		addVideoItem("GgaxcNmm4UU", "Ei Mom Jochonay | Madhubanti Mukherjee", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("qPna1ZlRxTo", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("hegsoEcow8Q", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("kLHCDZeTVJk", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		createPlayListForVideo("Funny Dog", R.drawable.category_1);

		//=========================Category for website loader
		createCategoryForWebsite("Prothom Alo", R.drawable.category_2, "https://www.prothomalo.com/");

		//=========================Category for website loader
		createCategoryForWebsite("PDF FromUrl", R.drawable.category_3, "https://drive.google.com/file/d/1vB-oWIwJU6KuIKnIoqWukjZEyNjrd7IJ/view?usp=sharing");

		//===========================Category for PDF Viewer
		createCategoryForPDF("PDF FromAsset", R.drawable.category_4, "my_sample_pdf.pdf");
		//==========================================================================*
		 */



		//=========================
		createCategoryForPDF("Text Book [PDF]", R.drawable.category_4, "class_5_english_for_today.pdf");
		//=========================


		//========================Video Item Category
		addVideoItem("GsSY9yIGMDI", "Unit 1: Hello!", "Class 5 English");
		addVideoItem("8oZbltotZmk", "Unit 2: See you!, Sound Practice 1", "Class 5 English");
		addVideoItem("7W-llUrRxPM", "Unit 3: Saikat's Family, Sound Practice 2", "Class 5 English");
		addVideoItem("dSnbUSOxhMw", "Unit 4: Leisure Time, Sound Practice 3", "Class 5 English");
		addVideoItem("_Iwbxt6Mtbs", "Unit 5: Days in a Calendar, Stressed Syllables 1", "Class 5 English");
		addVideoItem("GkYJVHELIrA", "Unit 6: Eat Healthy", "Class 5 English");
		addVideoItem("gMVkgaiKUug", "Unit 7: Be Healthy, Stressed Syllables 2", "Class 5 English");
		addVideoItem("-shQgR1bV6c", "Unit 8: Write to Me Soon!", "Class 5 English");
		addVideoItem("V_e2QgfEOXg", "Unit 9: Occupations", "Class 5 English");
		addVideoItem("VTSeMRq0Xic", "Unit 10: My Home District, Sound Practice 4", "Class 5 English");
		addVideoItem("wsHEG_oCYFI", "Unit 11: Where's the Library?", "Class 5 English");
		addVideoItem("Q-OhJDnoLqI", "Unit 12: How Far is Saint Martin's?", "Class 5 English");
		addVideoItem("eFsYIsIoZb8", "Unit 13: Telling the Time", "Class 5 English");
		addVideoItem("W2tDGHpdteU", "Unit 14: Story: The Hare and the Tortoise", "Class 5 English");
		addVideoItem("OnUStb28V5A", "Unit 15: Happy Birthday", "Class 5 English");
		addVideoItem("Hqa32wpeL-4", "Unit 16: May I Come In?, Birds on Strings", "Class 5 English");
		addVideoItem("RixaQL6Pi4k", "Unit 17: Sport", "Class 5 English");
		addVideoItem("h-TbqGTeewI", "Unit 18: City and Country, I Meant to Do My Work", "Class 5 English");
		addVideoItem("s0U8Fyb1QXA", "Unit 19: The Liberation War Museum", "Class 5 English");
		addVideoItem("sCQPF_m8ElU", "Unit 20: Life Is Beautiful!", "Class 5 English");
		addVideoItem("tBTIunUNITM", "Unit 21: It Was a Great Day!", "Class 5 English");
		addVideoItem("KIv2VXCYnfo", "Unit 22: Completing Forms", "Class 5 English");
		addVideoItem("gNvQC-ip5pk", "Unit 23: Stay Safe!", "Class 5 English");
		addVideoItem("SaK8ic2RPeI", "Unit 24: Cyclone Aila", "Class 5 English");
		addVideoItem("CBOQqy1HP34", "Unit 25: Story: Why Does the Frog Croak?", "Class 5 English");
		createPlayListForVideo("Class Lecture", R.drawable.category_1);

		//=========================
		createCategoryForWebsite("NCTB", R.drawable.category_2, "http://nctb.gov.bd/");

		createCategoryForWebsite("DPE", R.drawable.category_2, "http://www.dpe.gov.bd/");

		//==========================================================================*

	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>


}

