package io.github.timeraider4u.softwaretraces.ui.views;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

public class TreeView extends ViewPart {
	
	/**
	 * extension ID
	 */
	public static final String ID = "io.github.timeraider4u.softwaretraces.ui.views.TreeView"; //$NON-NLS-1$
	
	private TreeViewer viewer;
	
	public TreeView() {
	}
	
	@Override
	public void createPartControl(final Composite parent) {
		this.viewer = new TreeViewer(parent,
				SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		this.viewer.setContentProvider(new ContentProvider());
		// this.viewer.setLabelProvider(new SWTraceViewLabelProvider());
		// this.viewer.setSorter(new TreeElementSorter());
		// this.viewer.setInput(SWTraceTreeContentProvider.getDefaultInput(this
		// .getViewSite()));
		// this.setUpDragAndDropListeners();
		// this.viewer.addSelectionChangedListener(new MySelectionListener());
		// this.viewer.addDoubleClickListener(new MyDoubleClickListener());
		// ModelSingelton.getModel().addListener(
		// new MyChangedListener(this.viewer));
		this.setUpToolBar();
	}
	
	// private void setUpDragAndDropListeners() {
	// final Transfer[] transferTypes = new Transfer[] {
	// TextTransfer.getInstance() };
	// // this.viewer.addDragSupport(DND.DROP_MOVE | DND.DROP_COPY,
	// // transferTypes, new MyDragListener(this.viewer));
	// // this.viewer.addDropSupport(DND.DROP_MOVE | DND.DROP_COPY,
	// // transferTypes, new MyDropListener(this, this.viewer));
	// }
	
	private void setUpToolBar() {
		final IActionBars bars = this.getViewSite().getActionBars();
		final IToolBarManager manager = bars.getToolBarManager();
		// manager.add(new RefreshAction(manager, this.viewer));
		manager.add(new Separator());
		// manager.add(new CutAction(manager, this.viewer));
		// manager.add(new PasteAction(manager, this.viewer));
		manager.add(new Separator());
		// manager.add(new UpAction(manager, this.viewer));
		// manager.add(new DownAction(manager, this.viewer));
		manager.add(new Separator());
		// manager.add(new AddFeatureAction(manager, this.viewer));
		// manager.add(new RenameFeatureAction(manager, this.viewer));
		// manager.add(new DeleteFeatureAction(manager, this.viewer));
		manager.add(new Separator());
		// manager.add(new DeleteTraceAction(manager, this.viewer));
	}
	
	@Override
	public void setFocus() {
		this.viewer.getControl().setFocus();
	}
}
