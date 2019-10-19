import {foo} from "../src/foo";

describe('foo', () => {
  it('should return true', () => {
    expect(foo()).toBe(true);
  });
});
