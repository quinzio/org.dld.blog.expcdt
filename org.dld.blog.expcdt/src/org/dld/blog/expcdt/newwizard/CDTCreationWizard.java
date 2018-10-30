package org.dld.blog.expcdt.newwizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;

public class CDTCreationWizard extends Wizard implements INewWizard,IRunnableWithProgress {
	 
	 public CDTCreationWizard(){
	 super();
	 }
	 
	 @Override
	 public void run(IProgressMonitor arg0) throws InvocationTargetException,
	 InterruptedException {
	 
	 }
	 
	 @Override
	 public boolean performFinish() {
	 return true;
	 }
	 
	 @Override
	 public void init(IWorkbench arg0, IStructuredSelection arg1) {
	 
	 }
}