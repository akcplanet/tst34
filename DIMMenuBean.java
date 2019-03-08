//package com.statestr.dim.iiq.web;

import org.apache.log4j.Logger;

import sailpoint.tools.GeneralException;
import sailpoint.web.MenuBean;
import sailpoint.web.MenuBuilder;
import sailpoint.web.MenuBuilder.DecoratedMenuItem;

public class DIMMenuBean extends MenuBean {
private static final Logger   _logger = Logger.getLogger(DIMMenuBean.class);
	
	private static final String _MESSAGE_MENU_LEBEL_SERVER_REPORT = "menu_lebel_server_report";
	private static final String _REPORT_MENU_LEBEL_INTELLIGENCE = "menu_label_intelligence";
	private static final String _MESSAGE_MENU_DESCRIPTIONL_SERVER_REPORT = "menu_description_debug_server_report";
	private static final String _URL_MENU_SERVER_REPORT = "debug/log4jAdmin.jsf";

	public DIMMenuBean() {
		super();
	}

	@Override
	public DecoratedMenuItem getRoot() throws GeneralException {
		DecoratedMenuItem root = super.getRoot();
		for (DecoratedMenuItem tx : root.getLeftMenuItems()) {
			if (tx.getLabel().equalsIgnoreCase(_REPORT_MENU_LEBEL_INTELLIGENCE)) {
				tx.getDecoratedSubMenu()
						.add(new MenuBuilder.DecoratedMenuItem(this,
								MenuBuilder.MenuItem.createDebugMenuItem("Report Prod Server",
										"debug/reportServer.jsf", "menu_desc_server")));
						/*		MenuBuilder.MenuItem.createDebugMenuItem(_MESSAGE_MENU_LEBEL_SERVER_REPORT,
										_URL_MENU_SERVER_REPORT, _MESSAGE_MENU_DESCRIPTIONL_SERVER_REPORT)));*/
				
				/*
				 * tx.getDecoratedSubMenu() .add(new MenuBuilder.MenuItem("menu_label_reports",
				 * "analyze/reports/viewReports.jsf?resetTab=true&forceLoad=true",
				 * "menu_desc_reports");
				 */

			}
		}
		return root;
	}

}
