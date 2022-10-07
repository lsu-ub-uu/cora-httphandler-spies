/**
 * The testspies module provides common spies used when testing Cora projects.
 */
module se.uu.ub.cora.httphandler.spies {

	requires org.testng;
	requires transitive se.uu.ub.cora.httphandler;
	requires transitive se.uu.ub.cora.testutils;

	exports se.uu.ub.cora.httphandler.spies;
}