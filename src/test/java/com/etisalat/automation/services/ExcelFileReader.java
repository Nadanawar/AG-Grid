package com.etisalat.automation.services;

import java.io.File;
import java.util.Iterator;

import com.etisalat.automation.model.TableSearchTestingData;
import com.poiji.bind.Poiji;

public class ExcelFileReader {

	public Iterator<TableSearchTestingData> getData() {
		File myfile = new File(".\\testData\\data.xlsx");
		return Poiji.fromExcel(myfile, TableSearchTestingData.class).iterator();
	}

}
