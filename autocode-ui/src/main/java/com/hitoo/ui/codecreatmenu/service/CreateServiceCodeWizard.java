package com.hitoo.ui.codecreatmenu.service;

import org.eclipse.jface.wizard.Wizard;

import com.hitoo.config.ConfigFilePath;
import com.hitoo.config.createcode.service.ServiceCodeCreater;

public class CreateServiceCodeWizard extends Wizard {
	private SelectDomainPage selectDomainPage;
	private SelectTemplatePage selectTemplatePage;
	private ServiceCodeCreater serviceCodeCreater;

	public CreateServiceCodeWizard() {
		setWindowTitle("Service层代码生成");
		selectDomainPage = new SelectDomainPage();
		selectTemplatePage = new SelectTemplatePage();
	}

	@Override
	public void addPages() {
		addPage(selectDomainPage);
		addPage(selectTemplatePage);
	}
	
	@Override
	public boolean canFinish() {
		if(this.getContainer().getCurrentPage() == selectTemplatePage) {
			return true;		
		}
		return false;
	}

	@Override
	public boolean performFinish() {
		String[] domains = selectDomainPage.getSelectedDomains();
		String templateName = selectTemplatePage.getTemplatePath();
		
		String outputPath = ConfigFilePath.PROJECT_PATH+"/tmp/";
		serviceCodeCreater = new ServiceCodeCreater(templateName, outputPath);
		serviceCodeCreater.createCodes(domains);
		
		return true;
	}

}
