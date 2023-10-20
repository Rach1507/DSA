const obj = {
  Key1: "1",
  Key2: {
    a: "2",
    b: "3",
    c: {
      d: "3",
      e: "1",
    },
  },
};

console.log(obj);

const res = {};

const flatten = (dict, parentString, res) => {
  const keys = Object.getOwnPropertyNames(dict);

  keys.map((key) => {
    const value = dict[key];

    if (typeof value === "string") {
      const keyString = parentString ? `${parentString}.${key}` : `${key}`;
      res[keyString] = value;
    } else {
      const keyString = parentString ? `${parentString}.${key}` : `${key}`;
      flatten(value, keyString, res);
    }
  });
};

flatten(obj, "", res);

console.log(res);
